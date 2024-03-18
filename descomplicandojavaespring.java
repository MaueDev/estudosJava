
public class descomplicandojavaespring {
    public static void main(String[] args){
        //valores inteiros ou negativos, requer 8bits, maximo 127 e no minimo -128
        byte meuByte = 127;
        System.out.println("meu byte " + meuByte);

        //dobro de bit do byte, min -32768 e max 32767
        short meuShort = 3276;
        System.out.println("meu short " + meuShort);

        //usa 32bits, min -2147483648 e max 2147483647
        int idade = 25;
        System.out.println("meu int " + idade);

        //64 bits
        long meuLong = 10L;
        System.out.println("meu long " + meuLong);

        //dupla precisao, 64bits
        double salario = 102.51;
        System.out.println("meu double " + salario);

        //precisao simples, 32 bits
        float salarioFloat = 102.51F;
        System.out.println("meu float " + salarioFloat);

        //16 bits, um unicode
        char letra = 'A';
        System.out.println("meu char " + letra);

        //1 bit
        boolean JavaELegal = true;
        System.out.println("meu boolean " + JavaELegal);


    }
}
