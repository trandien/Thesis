$(document).ready(function(){
	if ($("#updateSuccess").html() != "" || $("#updateSuccess").html() != null) {
		$(".classLi").each(function(){
			$(this).removeClass("active");
		});
		$(".tab-pane").each(function(){
			$(this).removeClass("in active");
		});
		$("#thongTin").addClass("active");
		$("#tabThongTin").addClass("in active")
	}
});

window.setTimeout(function() { $(".alert-update-success").alert('close'); }, 2000);