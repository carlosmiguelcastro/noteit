$(document).ready(function() {
  $( "#adiciona" ).click(function() {
    //$( "#notas" ).append("<li><div><h2><input type=\"text\" name=\"titulo\" placeholder=\"Titulo\" value=\"" + $( "#titulo" ).val() + "\" readonly></h2><a id=\"remove\" href=\"#\" ><i class=\"fa fa-times\" aria-hidden=\"true\"></i></a><p><textarea name=\"nota\" cols=\"37\" rows=\"16\" placeholder=\"Texto\" readonly>" + $( "#nota" ).val() + "</textarea></p></div></li>");
    $( "#form" ).submit();
  });
  /*$(document).on("click", "a#remove", function() {
    $(this).parents("li").remove();
  });*/
});
