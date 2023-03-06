import day35_Encapsulation.Employee;

public class aidat {


    public static void main(String[] args) {


        Employee employee1 = new Employee("Tatiana", 'F', 28, 110000);

        System.out.println(employee1);


        int a =3600+1800+750+750+550+1350+900+550+1650+900+900+550+1650+750+750+550+750+6900+550+550+900+450+550+2250+550+2250+550+1500+2400+2400+550;


        System.out.println("2022 yılı geliri = "+a);

        System.out.println("20021 den aktarılan 3656 toplam = " +(3656+41050));


int gider2022 =1500+150+120+120+550+1500+42+60+75+655+1500+67+279+89+95+12+70+1500+60+350+235+600+100+423+634+1500+50+273+300+135+1500+87+75+220+1500+115+35+75+400+1500+268+105+125+78+250+1500+150+125+10500+269+324+1500+500+110+1500+354+72+321+195+55+600;

        System.out.println("gider2022 = " + gider2022);

        System.out.println("kasa = " +(a-gider2022));


        int gider2023 = 1500+73+120+500+500+351+120+1500+67+75+312;

        System.out.println("gider2023 = " + gider2023);

        int gelir2023 = 2550+550+150+550+1950;
        System.out.println("gelir2023 = " + gelir2023);

        System.out.println("kasa2023 = " +(gelir2023- gider2023));


        int gelir2_2022 = 2550+500+550+1800+750+750+550+1350+900+550+1650+900+900+550+1650+750+750+550+600+6900+550+550+900+450+550+2250+550+2250+550+1500+2400+550+240;


        System.out.println("gelir2_2022 =  " + gelir2_2022); }
}
