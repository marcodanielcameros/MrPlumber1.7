/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/*(function(){
    /*htmlStr = "";
    htmlStr += "<li>";
    htmlStr += "<div class="+"text-center"+">";
    htmlStr += "<a href="+"Agenda"+">";
    htmlStr += "</a>";
    htmlStr += "</div>";
    htmlStr += "</li>";
    htmlStr = 6;
    console.log(htmlStr);
})();*/

$( document ).ready(function() {
    
    
ajax();
    
// Handler for .ready() called.
    
});


function ajax() {
    $.ajax({
        url: "GetDataEvent",
        type: 'POST',
        success: function (data) {
            console.log(data);
            console.log(data.data.length);
             $("#NoAlertas").html(data.data.length);
        
        },
        error: function (request, error) {
            console.log([request, error]);
        }
    });
}