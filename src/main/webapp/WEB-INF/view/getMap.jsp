<%@page import="com.fitess.common.user.vo.HealthTeamVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
   
<%

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
	<script type="text/javascript"src="https://dapi.kakao.com/v2/maps/sdk.js?appkey=e11e0bca2855ad3abc123dc69e2a7bf7"></script>
	<h3>제목 : ${mapOne.ht_title}</h3>
	<script>
		
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
		
		var infowindow = new kakao.maps.InfoWindow({
			position : iwPosition,
			content : iwContent
		});
		
		// 마커 위에 인포윈도우를 표시합니다. 두번째 파라미터인 marker를 넣어주지 않으면 지도 위에 표시됩니다.
		infowindow.open(map, marker);
	</script>
</body>
</html>