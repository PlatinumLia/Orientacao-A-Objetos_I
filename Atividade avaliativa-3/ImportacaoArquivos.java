public interface ImportacaoArquivos {
    Boolean carregarConfig(String arqConfig);
    void importarDados(String arqDadosEntrada);
}