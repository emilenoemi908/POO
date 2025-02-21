class PessoaFisica extends Contribuinte{

    double gastosSaude;

    public PessoaFisica(String nome, double rendaAnual, double gastosSaude){

        super(nome,rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double calcularImposto(){

        double imposto;

        if(rendaAnual < 20000){

            imposto= rendaAnual * 0.15;
        }
        else{
            imposto= rendaAnual * 0.25;
        }

        if(gastosSaude >0){

            imposto= (rendaAnual * 0.25) - (gastosSaude * 0.5);
        }



        return imposto;
    }


}
