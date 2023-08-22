public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        //weatherData.setMeasurements(82, 70, 29.2f);
    }
}

// https://d-pdf.com/themes/default/resources/js/pdfjs/web/viewer.html?file=/eBooks/2020/September/5f57dd583bbad/9780596007126.pdf