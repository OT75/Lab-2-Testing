public class Q3 {
    public String state0 = "NORMAL", state1 = "TIME";
    public int m = 0, h = 0, D = 1, M = 1, Y = 2000;

    public void Clicking(char x)
    {
        if (state0.equals("NORMAL"))
        {
            if (x == 'a')
            {
                if (state1.equals("TIME"))
                {
                    state1 = "DATE";

                } else
                    {
                    state1 = "TIME";
                }
            }
            if (x == 'b')
            {
                state0 = "ALARM";

                state1 = "Alarm";
            }
            if (x == 'c')
            {
                state0 = "UPDATE";

                state1 = "min";
            }
        }
        if (state0.equals("ALARM"))
        {
            if (x == 'a')
            {
                state1 = "Chime";
            }
            if (x == 'd') {
                state0 = "NORMAL";
                state1 = "TIME";
            }
        }
        if (state0.equals("UPDATE"))
        {
            if (x == 'a') {
                if (state1.equals("year"))
                {
                    state0 = "NORMAL";
                    state1 = "TIME";
                }
                if (state1.equals("month"))
                {
                    state1 = "year";
                }
                if (state1.equals("day"))
                {
                    state1 = "month";
                }
                if (state1.equals("hour"))
                {
                    state1 = "day";
                }
                if (state1.equals("min"))
                {
                    state1 = "hour";
                }
            }
            if (x == 'b')
            {
                if (state1.equals("min"))
                {
                    m++;
                    if (m>=60) {
                        m=0;
                    }
                }
                if (state1.equals("hour"))
                {
                    h++;
                    if (h>=24)
                    {
                        h=0;
                    }
                }
                if (state1.equals("day"))
                {
                    D++;
                    if (D>31) {
                        D=1;
                    }
                }
                if (state1.equals("month"))
                {
                    M++;
                    if (M>12) {
                        M=1;
                    }
                }
                if (state1.equals("year"))
                {
                    Y++;
                    if(Y>2100){
                        Y=2000;
                    }
                }

            }
            if (x == 'd') {
                state0 = "NORMAL";
                state1 = "TIME";
            }
        }

    }
    public String getState()
    {
        return(state0+","+state1);
    }
    public String getDate()
    {
        return (Y+"-"+M+"-"+D);
    }
    public String getTime(){
        return (h+":"+m);
    }

}