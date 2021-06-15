<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
   		String id = request.getParameter("id");
    	int userId = Integer.parseInt(id);
    
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>키워드로 장소 겁색하기</title>
</head>
<body>
	<input type="text" name="search" id="placeKey" size = '10'>
	<button onclick="makeMap()">검색</button>
	<div id="map" style="width:100%;height:350px;"></div>
	<form action="insertMap.do" method="post">
		제목
		<input type="text" name="ht_title">
		도로명 주소
		<input id="locRoadAdress" type="text" name="ht_placeaddress" size ="20"><br>
		위도
		<input id="locPosition_Y" type="text" name="ht_y"><br>
		경도
		<input id="locPosition_X" type="text" name="ht_x"><br>
		장소이름
		<input id="locTitle" type="text" name="ht_placename"><br>
		인원수 제한 
		<input id="limitCnt" type="text" name="ht_limitCnt"><br>
		내용
		<textarea name="ht_content" cols="30" rows="10"></textarea>
		
		<input type="hidden" name="user_id" value="<%=userId%>">
		
		<input type="submit" value="확인">
	</form>
	
	
	 
	<script type="text/javascript" src="https://dapi.kakao.com/v2/maps/sdk.js?appkey=de65e137185c3c1a57b774574870f503&libraries=services"></script>
	<script>
		function makeMap(){
			
			var key = document.getElementById('placeKey').value;
			
			var infowindow = new kakao.maps.InfoWindow({zIndex:1});

			var mapContainer = document.getElementById('map'), // 지도를 표시할 div 
			    mapOption = {
			        center: new kakao.maps.LatLng(37.566826, 126.9786567), // 지도의 중심좌표
			        level: 3 // 지도의 확대 레벨
			    };  

			// 지도를 생성합니다    
			var map = new kakao.maps.Map(mapContainer, mapOption); 

			// 장소 검색 객체를 생성합니다
			var ps = new kakao.maps.services.Places(); 

			// 키워드로 장소를 검색합니다
			ps.keywordSearch(key, placesSearchCB); 

			// 키워드 검색 완료 시 호출되는 콜백함수 입니다
			function placesSearchCB (data, status, pagination) {
			    if (status === kakao.maps.services.Status.OK) {

			        // 검색된 장소 위치를 기준으로 지도 범위를 재설정하기위해
			        // LatLngBounds 객체에 좌표를 추가합니다
			        var bounds = new kakao.maps.LatLngBounds();

			        for (var i=0; i<data.length; i++) {
			            displayMarker(data[i]);    
			            bounds.extend(new kakao.maps.LatLng(data[i].y, data[i].x));
			        }       

			        // 검색된 장소 위치를 기준으로 지도 범위를 재설정합니다
			        map.setBounds(bounds);
			    } 
			}

			// 지도에 마커를 표시하는 함수입니다
			function displayMarker(place) {
			    
			    // 마커를 생성하고 지도에 표시합니다
			    var marker = new kakao.maps.Marker({
			        map: map,
			        position: new kakao.maps.LatLng(place.y, place.x) 
			    });

			    // 마커에 클릭이벤트를 등록합니다
			    kakao.maps.event.addListener(marker, 'click', function() {
			        // 마커를 클릭하면 장소명이 인포윈도우에 표출됩니다
			        infowindow.setContent('<div style="padding:5px;font-size:12px;">' + place.place_name + '</div>');
			        infowindow.open(map, marker);
			        
			        Position_Y = marker.getPosition().getLat();
			        Position_X = marker.getPosition().getLng();
			        
			        //좌표로 도로명 주소 찾기 시작
			        var geocoder = new kakao.maps.services.Geocoder();

			        var coord = new kakao.maps.LatLng(Position_Y, Position_X);
			        var callback = function(result, status) {
			            if (status === kakao.maps.services.Status.OK) {
			            	locRoadAdress = result[0].road_address.address_name;
			                console.log('그런 너를 마주칠까 ' + result[0].road_address.address_name + '을 못가');
//					        console.log(locRoadAdress);
			        		document.getElementById("locRoadAdress").value = locRoadAdress;
			            }
			        };

			        geocoder.coord2Address(coord.getLng(), coord.getLat(), callback);
			        document.getElementById("locPosition_Y").value = Position_Y;
			        document.getElementById("locPosition_X").value = Position_X;
			        document.getElementById("locTitle").value = place.place_name;
			        //좌표로 도로명 주소 찾기 끝
			        
			    });
			}
			
			
		}
	</script>
</body>
</html>