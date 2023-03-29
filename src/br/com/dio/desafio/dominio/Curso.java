package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int cargaHoraria;

    @Override
    public double calcularXP (){
        return XP_PADRAO * cargaHoraria;
    }
    public void setCargaHoraria (int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    public int getCargaHoraria(){
    return this.cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitulo() + "\nDescricao:" + getDescricao() + "\nCarga Horaria:" + cargaHoraria + "\n";
    }
     

}
