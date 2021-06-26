<%@page import="com.fitness.user.kakaoMap.vo.HealthTeamVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%	
	int ht_id = Integer.parseInt(request.getParameter("ht_id"));
	
	HealthTeamVO mapOne = (HealthTeamVO) session.getAttribute("mapOne");

%> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>약속 장소 표기</title>
</head>
<body>
	<div id="map" style="width:100%;height:350px;"></div>
	<script type="text/javascript"src="https://dapi.kakao.com/v2/maps/sdk.js?appkey=de65e137185c3c1a57b774574870f503"></script>
	<h3>제목 : ${mapOne.ht_title}</h3>
	<h3>내용 : ${mapOne.ht_content}</h3>
	<h3>참가한 인원 (참가 제한 인원 : ${mapOne.ht_limitCnt})</h3>
	
	<c:set var='maker' value='${mapOne.user_id }'/>
	<c:set var='login_u' value='${userInfo.user_id }'/>
	
	<c:out value="${maker }"/>
	<c:out value="${login_u }"></c:out>
	
	<c:if test = "${maker ne login_u }">
		<button>안녕하세요 </button>
	</c:if>
	<button class="join_button" onclick="join()">참가하기</button>
	
	<hr>
	<script>
 
		// 마커에 인포 윈도우 표시하기
		var mapContainer = document.getElementById('map'), // 지도를 표시할 div
		mapOption = {
				center: new kakao.maps.LatLng(${mapOne.ht_y}, ${mapOne.ht_x}), // 지도의 중심좌표
				level: 3 // 지도 확대 레벨
		}
		
		var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
		
		// 마커가 표시될 위치입니다
		var markerPosition = new kakao.maps.LatLng(${mapOne.ht_y}, ${mapOne.ht_x});
		
		// 마커를 생성합니다
		var marker = new kakao.maps.Marker({
			position: markerPosition
		});
		
		// 마커가 지도 위에 표시되도록 설정합니다.
		marker.setMap(map);
		
		var iwContent = '<div style="padding:5px;">Hello World! <br><a href="https://map.kakao.com/link/map/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">큰지도보기</a> <a href="https://map.kakao.com/link/to/Hello World!,33.450701,126.570667" style="color:blue" target="_blank">길찾기</a></div>', // 인포윈도우에 표출될 내용으로 HTML 문자열이나 document element가 가능합니다
	    iwPosition = new kakao.maps.LatLng(${mapOne.ht_y}, ${mapOne.ht_x}); //인포윈도우 표시 위치입니다
		
		var infowindow = new kakao.maps.InfoWindow({
		    position : iwPosition, 
		    content : iwContent 
		});
		
		// 마커 위에 인포윈도우를 표시합니다. 두번째 파라미터인 marker를 넣어주지 않으면 지도 위에 표시됩니다.
		infowindow.open(map, marker);
	</script>
	<script>
	console.log(${userInfo.user_id});
	console.log(<%=ht_id%>);
	
	console.log(typeof ${userInfo.user_id});
	console.log(typeof <%=ht_id%>);
	
		function join(){
			var submitObj = new Object();
			
			$.ajax({
				type: 'post',
				contentType: 'application/json;charset=UTF-8',
				data: JSON.stringify(submitObj),
				dataType : 'json',
				url : 'insertJoin.do',
				success : function(data){
					$.each(data, function(index, item){
						document.write('참가자 이름 : ' + JSON.parse(item).user_id + '<br />');
					});
				}
			})
		}
	</script>
</body>
</html>