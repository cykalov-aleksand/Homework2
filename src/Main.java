public class Main {
    public static void main(String[] args) {

        System.out.println("---------------Задание №1----------------");
        var dog=8.0;
        var cat=3.6;
        var paper=763789;
        System.out.println("dog = "+dog+";");
        System.out.println("cat = "+cat+";");
        System.out.println("paper = "+paper+";");
        System.out.println("---------------Задание №2----------------");
        dog=dog+4;
        cat=cat+4;
        paper=paper+4;
        System.out.println("dog+4 = "+dog+";");
        System.out.println("cat+4 = "+cat+";");
        System.out.println("paper+4 = "+paper+";");
        System.out.println("---------------Задание №3----------------");
        dog=dog-3.5;
        cat=cat-1.6;
        paper=paper-7639;
        System.out.println("(dog+4)-3.5 = "+dog+";");
        System.out.println("(cat+4)-1.6 = "+cat+";");
        System.out.println("(paper+4)-7639 = "+paper+";");
        System.out.println("---------------Задание №4----------------");
        var friend=19;
        System.out.println("friend = "+friend+";");
        friend=friend+2;
        System.out.println("friend+2 = "+friend+";");
        friend=friend/7;
        System.out.println("(friend+2)/7 = "+friend+";");
        System.out.println("---------------Задание №5----------------");
        var frog=3.5;
        System.out.println("frog = "+frog+";");
        frog=frog*10;
        System.out.println("frog*10 = "+frog+";");
        frog=frog/3.5;
        System.out.println("(frog*10)/3,5 = "+frog+";");
        frog=frog+4;
        System.out.println("(frog*10)/3,5+4 = "+frog+";");
        System.out.println("---------------Задание №6----------------");
        var boxerWaight1=78.2;
        var boxerWaight2=82.7;
        var commonWaight=boxerWaight1+boxerWaight2;
        var diferenciWeight=boxerWaight2-boxerWaight1;
        System.out.println("Масса первого боксера = "+boxerWaight1+"кг.;");
        System.out.println("Масса второго боксера = "+boxerWaight2+"кг.;");
        System.out.println("Общая масса двух бойцов = "+commonWaight+"кг.;");
        System.out.println("Разница в весе двух бойцов = "+diferenciWeight+"кг.;");
        System.out.println("---------------Задание №7----------------");
        var remainsWaight=boxerWaight2%boxerWaight1;
        System.out.println("Остаток от деления между двумя весами = "+remainsWaight+"кг.;");
        System.out.println("---------------Задание №8----------------");
        var totalTime=640;
        var employeeTime=8;
        var numberEmployee=totalTime/employeeTime;
        System.out.println("Всего работников в компании - "+numberEmployee+" человек");
        numberEmployee=numberEmployee+94;
        totalTime=numberEmployee*employeeTime;
        System.out.println("Если в компании работает "+numberEmployee+
                " человек, то всего "+totalTime+" часов работы может быть поделено между сотрудниками");
        System.out.println("\\------Домашнее задание выполнено-------\\ ");
    }
}