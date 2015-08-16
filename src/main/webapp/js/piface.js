$(document).ready(function() {

    function reportResponse(res) {
        $("textarea#serverResponse").val(res);
    }

    // LED Test 1 click handler
    $("#button1").on("click", function() {

        $.ajax("/api/button1", {
            dataType: "text",
            success: function(data, textStatus) {
                reportResponse(data);
            }
        });

    });



    // LED Test 2 click handler
    $("#button2").on("click", function() {

        $.ajax("/api/button2", {
            dataType: "text",
            success: function(data, textStatus) {
                reportResponse(data);
            }
        });

    });



    // LED Test 3 click handler
    $("#button3").on("click", function() {

        $.ajax("/api/button3", {
            dataType: "text",
            success: function(data, textStatus) {
                reportResponse(data);
            }
        });

    });

});