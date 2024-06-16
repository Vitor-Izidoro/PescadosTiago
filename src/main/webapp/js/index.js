window.onload = function() {
    var peixesListContainer = document.getElementById('peixes-list');

    // Requisição AJAX para obter os peixes do backend Java
    var xhr = new XMLHttpRequest();
    xhr.open('GET', 'ListagemServlet', true); // 'ListagemServlet' é um exemplo de URL do Servlet no seu backend Java
    xhr.setRequestHeader('Content-Type', 'application/json');

    xhr.onload = function() {
        if (xhr.status === 200) {
            var peixes = JSON.parse(xhr.responseText);

            peixes.forEach(function(peixe) {
                var peixeCard = `
                    <div class="card-peixe">
                        <h3>${peixe.nome}</h3>
                        <p>Tamanho: ${peixe.tamanho} cm</p>
                    </div>
                `;
                peixesListContainer.innerHTML += peixeCard;
            });
        } else {
            console.error('Erro ao obter os peixes:', xhr.status);
        }
    };

    xhr.send();
};
