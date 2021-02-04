var apiclient = (function(){

    return {
        calcular: function(valores, callback) {
            var promise = $.post({
        		url: "/calculadora",
        		data: JSON.stringify(valores),
        		contentType: "application/json"
            });
        	promise.then(function(data){
        		callback(null, JSON.parse(data));
        	}, function(error) {
        		callback(error, null);
        	});
        }
    }
})();