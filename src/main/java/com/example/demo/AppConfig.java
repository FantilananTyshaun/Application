@Configuration
public class AppConfig {

    @Bean
    public Map<String, Product> inventory(){
        return new HashMap<>();
    }
}