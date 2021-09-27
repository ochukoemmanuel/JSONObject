package com.ebeatsz.jsonobject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    // Widgets
    TextView name, salary;

    // JSON STRING
    String JSON_STRING = "{\"employee\":{\"name\":\"Json Object\",\"salary\":5000}}";

    String nameS, salaryS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference for textView
        name = findViewById(R.id.name);
        salary = findViewById(R.id.salary);

        // Getting JSON Objects
        try {
            // Get JSON from json file
            JSONObject obj = new JSONObject(JSON_STRING);

            // Fetch JSON Object name employee
            JSONObject employee = obj.getJSONObject("employee");

            // Getting the employee name and salary
            nameS = employee.getString("name");
            salaryS = employee.getString("salary");

            name.setText("Name: " + nameS);
            salary.setText("Salary: " + salaryS);


        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
}