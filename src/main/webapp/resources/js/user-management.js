$(document).ready(function() {

	$("#deleteSelected").click(function() {

		var userSelected = [];

		$('.userBody input:checked').each(function() {
			userSelected.push($(this).attr('value'));
		});

		var contextPath = $(this).attr("contextPath"); 

		console.log(userSelected);

		// Submit to controller
		console.log(contextPath + "/deleteUser?userIds=" + userSelected);
		document.location = contextPath + "/deleteUser?userIds=" + userSelected;
	})
	$("#deleteSelected1").click(function() {

		var userSelected = [];

		$('.userBody input:checked').each(function() {
			userSelected.push($(this).attr('value'));
		});

		var contextPath = $(this).attr("contextPath"); 

		console.log(userSelected);

		// Submit to controller
		console.log(contextPath + "/deleteUser?userIds=" + userSelected);
		document.location = contextPath + "/deleteUser?userIds=" + userSelected;
	})
	$("#updateEnableSelected").click(function() {

		var userSelected = [];

		$('.userBody input:checked').each(function() {
			userSelected.push($(this).attr('value'));
		});

		var contextPath = $(this).attr("contextPath"); 

		console.log(userSelected);

		// Submit to controller
		console.log(contextPath + "/updateToEnable?userIds=" + userSelected);
		document.location = contextPath + "/updateToEnable?userIds=" + userSelected;
	})
	$("#updateEnableSelected1").click(function() {

		var userSelected = [];

		$('.userBody input:checked').each(function() {
			userSelected.push($(this).attr('value'));
		});

		var contextPath = $(this).attr("contextPath"); 

		console.log(userSelected);

		// Submit to controller
		console.log(contextPath + "/updateToEnable?userIds=" + userSelected);
		document.location = contextPath + "/updateToEnable?userIds=" + userSelected;
	})
	$("#updateDisableSelected").click(function() {

		var userSelected = [];

		$('.userBody input:checked').each(function() {
			userSelected.push($(this).attr('value'));
		});

		var contextPath = $(this).attr("contextPath"); 

		console.log(userSelected);

		// Submit to controller
		console.log(contextPath + "/updateToDisable?userIds=" + userSelected);
		document.location = contextPath + "/updateToDisable?userIds=" + userSelected;
	})
	$("#updateDisableSelected1").click(function() {

		var userSelected = [];

		$('.userBody input:checked').each(function() {
			userSelected.push($(this).attr('value'));
		});

		var contextPath = $(this).attr("contextPath"); 

		console.log(userSelected);

		// Submit to controller
		console.log(contextPath + "/updateToDisable?userIds=" + userSelected);
		document.location = contextPath + "/updateToDisable?userIds=" + userSelected;
	})
	$("#toChangeTheOrder").click(function() {
	var contextPath = $(this).attr("contextPath"); 

		document.location = contextPath + "/viewListUserSort";
	})
	
   $("#checkAll").click(function(){
    $('input:checkbox').not(this).prop('checked', this.checked);
    })

	
	});
	
	
	
	
	 var modal = document.getElementById("myModal");

        // Get the button that opens the modal
        var btn = document.getElementById("myBtn");

        // Get the <span> element that closes the modal
        var span = document.getElementsByClassName("close")[0];
        var btn2 = document.getElementById("myBtn2");

        var add = document.getElementById("add");
        var delete1 = document.getElementById("delete1");

        add.onclick = function() {
            var a = document.getElementById("list2");

            var c = document.getElementById("list1");
            var d = document.createElement("option");
            d.text = a.options[(a.selectedIndex)].text;
            c.options.add(d, 1);
            a.options.remove(a.selectedIndex);
        }
        delete1.onclick = function() {
            var q = document.getElementById("list1");
            var w = document.getElementById("list2");
            var e = document.createElement("option");
            e.text = a.options[(q.selectedIndex)].text;
            w.options.add(e, 1);
            q.options.remove(q.selectedIndex);

        }

        // When the user clicks the button, open the modal 
        btn.onclick = function() {
            modal.style.display = "block";
        }

        // When the user clicks on <span> (x), close the modal
        span.onclick = function() {
            modal.style.display = "none";
        }
        btn2.onclick = function() {
            modal.style.display = "none";
        }

        // When the user clicks anywhere outside of the modal, close it
        window.onclick = function(event) {
            if (event.target == modal) {
                modal.style.display = "none";
            }
        }