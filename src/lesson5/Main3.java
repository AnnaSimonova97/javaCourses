package lesson5;

public class Main3 {
    public static void main(String[] args) {
        boolean [][] scheduled = new boolean[7][7];

        ScheduledUtils.reserve(scheduled, "Пн", 3);
        ScheduledUtils.reserve(scheduled, "Вт", 0);
        ScheduledUtils.reserve(scheduled, "Вт", 0);
        ScheduledUtils.reserve(scheduled, "Чт", 4);

       /* scheduled[0][0] = true;
        scheduled[2][3] = true;
        scheduled[3][6] = true;
        scheduled[4][0] = true;
        scheduled[5][3] = true;*/
        System.out.println("        пн     вт     ср     чт     пт     сб     вс");

        for( int i = 0; i < scheduled.length; i ++) {
            System.out.print((i+9)+"-" +(i +10) + " ");
            for (int j = 0; j < scheduled[i].length; j++) {
                if(scheduled[i][j]){
                    System.out.print("занято ");
                }
                else {
                    System.out.print("   -   ");
                }
            }
            System.out.println();
        }

    }
    //формула создания метода
    //1 - модификатор доступа (одно из 4-х слов)
    /** public - виден внутри всего проекта
     * ________ - виден внутри текущей папки
     * protected - виден внутри текущей папки и внутри дочерним классам
     * private - виден только внутри текущего класса
     * 2 - static (есть или нет)
     * 3 - возвращаемый тип (int, String, void - если ничего не ожидаю)
     * 4 - название метода(максимально понятно)
     * 5 - входящие параметры в круглых скобках через запятую с указанием типа (int a, int b, int c)
     * 6 - тело метода, то что будет происходить при вызове метода
     */
}
