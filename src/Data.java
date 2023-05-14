

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (verificaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. ");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean verificaData(int dia, int mes, int ano) {
        boolean bissexto = verificaAnoBissexto();

        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > diasNoMes(mes, bissexto)) {
            return false;
        }

        return true;
    }

    public boolean verificaAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
    }


    private int diasNoMes(int mes, boolean bissexto) {
        switch (mes) {
            case 2:
                return bissexto ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }


    public String toString() {
        return dia+"/"+mes+"/"+ano;
    }

    public int compareTo(Data outraData) {
        if (this.ano != outraData.getAno()) {
            return Integer.compare(this.ano, outraData.getAno());
        } else if (this.mes != outraData.getMes()) {
            return Integer.compare(this.mes, outraData.getMes());
        } else {
            return Integer.compare(this.dia, outraData.getDia());
        }
    }
}



