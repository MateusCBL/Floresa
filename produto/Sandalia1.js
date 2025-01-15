document.getElementById('selecionar-tamanho').addEventListener('click', function() {
    const menu = document.getElementById('Sandaliaverde');
    menu.classList.toggle('show'); // Mostra ou esconde o menu
  });
  
  const botoesTamanho = document.querySelectorAll('.tamanho');
  botoesTamanho.forEach(function(botao) {
    botao.addEventListener('click', function() {
      const tamanhoSelecionado = botao.getAttribute('data-tamanho');
      document.getElementById('tamanho-selecionado').textContent = `Tamanho: ${tamanhoSelecionado}`;
      document.getElementById('Sandaliaverde').classList.remove('show'); // Fecha o menu
    });
  });
  