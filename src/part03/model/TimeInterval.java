package part03.model;

public class TimeInterval
{
    private String start;
    private String end;

    public TimeInterval(String interval)
    {
        String[] intervals = interval.split(" ");
        this.start = intervals[0];
        this.end = intervals[1];
    }

    public TimeInterval(String start, String end)
    {
        this.start = start;
        this.end = end;
    }

    /***************************************************************************
     * @return возвращает истину, если интервал имеет правильные значения
     */
    public boolean isValid()
    {
        // FIXME измени метод, чтобы он проверял валидность времени
        return true;
    }

    /***************************************************************************
     * @return Возврвщает время интервала в минутах
     */
    public int getDuration()
    {
        // FIXME исправь метод согласно работе тестов
        int hour = get(start, Type.HOUR);
        int minute = get(start, Type.MINUTE);
        int startMinute = hour * 60 + minute;
        hour = get(end, Type.HOUR);
        minute = get(end, Type.MINUTE);
        int endMinute = hour * 60 + minute;
        return endMinute - startMinute;
    }

    private static int get(String time, Type type)
    {
        return Integer.valueOf(time.split(":")[type.getIndex()]);
    }

    private enum Type
    {
        HOUR(0),
        MINUTE(1);
        
        Type(int index)
        {
            this.index = index;
        }

        private int index;

        public int getIndex()
        {
            return index;
        }
    }
}