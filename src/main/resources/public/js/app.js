var app = (function () {

  var add = function() {
      var valores = $("#lista").val(); //coge el valor del campo //"#" jquery
      listaValores = valores.split(',');
      apiclient.calcular(listaValores, view);
  }

  var view = function(error, numeros) {
    if(error != null){
    alert("Verifique los datos ingresados");
    return;
  }
    $("#media").text(numeros.media);
    $("#desviacion").text(numeros.desviacion);
  }

  return {
      calcularValores: function() {
          add();
      }
  }

})();