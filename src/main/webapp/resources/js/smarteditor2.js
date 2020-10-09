$(function(){
	var oEditors = [];
	//스마트 에디터 생성 함수
	nhn.husky.EZCreator.createInIFrame({
		oAppRef : oEditors,
		elPlaceHolder : "contents",
		sSkinURI : "resources/smarteditor2/SmartEditor2Skin.html",
		htParams : {
			bUseToolbar : true,	// 툴바 사용 여부
			bUseVerticalResizer : true,	// 입력창 크기 조절바 사용 여부
			bUseModeChanger : true,	// 모드 탭(Editor | HTML | TEXT) 사용 여부
		},
		fCreator: "createSEditor2" // 이외에도 여러 옵션들이 더 있으니 찾아볼 것.
	});
	
	$("#EditorSaveBtn").click(function(){
		oEditors.getById["contents"].exec("UPDATE_CONTENTS_FIELD", []); 
		$("#EditorForm").submit(); // id 식별자 이름은 대상만 맞다면 변경해도 상관 없음
	});
	
})