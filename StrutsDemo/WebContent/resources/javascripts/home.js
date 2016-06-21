$(document).ready(function() {
	$('#btnAdd').click(function() {
//		location.assign("addUserAction");
		$("#action").val(ACTION_ADD);
//		alert($("#action").val());
		document.mainForm.submit();
	});
	
	$('#btnUpdate').click(function() {
		$("#action").val(ACTION_UPDATE);
		document.mainForm.submit();
//		alert($("#action").val());
	});
	
	$('#btnDelete').click(function() {
		$("#action").val(ACTION_DELETE);
//		alert($("#action").val());
		document.mainForm.submit();
	});
	$("#mainForm").submit(function () {
		alert("submit");
		return false;
	})
	
})

