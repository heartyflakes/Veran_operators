package mcm.edu.ph.veran_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display = findViewById(R.id.displaytxt);

                int birthYear = 2003;
                int birthMonth = 2;
                int birthDay = 14;

                int currentYear = 2021;
                int currentMonth = 1;
                int currentDay = 26;

                int ageInYears, ageInMonths, ageInDays;

                if(birthMonth > currentMonth){
                    currentMonth += 12;
                    currentYear -= 1;

                }

                if(birthDay > currentDay){
                    currentDay += 31;
                    currentMonth -=1;

                 ageInYears = currentYear - birthYear;
                 ageInMonths = currentMonth - birthMonth;
                 ageInDays = currentDay - birthDay;

                 display.setText( "My precise age is \n"+
                            String.valueOf(ageInYears)+
                            " Years, \n"+
                            String.valueOf(ageInMonths)+
                            " Months, \n"+
                            String.valueOf(ageInDays)+
                            " Days.");

                }
    }


}