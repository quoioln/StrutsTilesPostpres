$(document).ready(function() {
	$('#btnUpdate').click(function() {
		$("#action").val(ACTION_ADD);
		document.mainForm.submit();
	});
	
//	$('#btnUpdate').click(function() {
//		$("#action").val(ACTION_UPDATE);
//		document.mainForm.submit();
////		alert($("#action").val());
//	});
//	
//	$('#btnDelete').click(function() {
//		$("#action").val(ACTION_DELETE);
////		alert($("#action").val());
//		document.mainForm.submit();
//	});
//	$("#mainForm").submit(function () {
//		alert("submit");
//		return false;
//	})
//	
})

