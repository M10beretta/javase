package various.staticBlock;
/*
Создание статического блока в Java
*/

import java.util.Date;

public class TimeOfProgramStart {
    static Date timeStart;

    static {
        timeStart = new Date();

        System.out.println("Объект ещё не создан, но статический блок " +
                "уже выполняется.");
        System.out.println("Время запуска программы: " + timeStart.toString());
    }

    public TimeOfProgramStart() {
        System.out.println("Объект создан.");
        System.out.println("Время запуска программы: " + timeStart.toString());
    }
}
