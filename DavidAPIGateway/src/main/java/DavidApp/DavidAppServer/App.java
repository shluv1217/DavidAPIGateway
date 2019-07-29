package DavidApp.DavidAppServer;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import DavidApp.DavidAppServer.model.Hotel;
import DavidApp.DavidAppServer.model.Text;
import DavidApp.DavidAppServer.repository.HotelRepository;
import DavidApp.DavidAppServer.repository.TextRepository;
import DavidApp.DavidAppServer.App;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.comprehend.AmazonComprehend;
import com.amazonaws.services.comprehend.AmazonComprehendClientBuilder;
import com.amazonaws.services.comprehend.model.DetectDominantLanguageRequest;
import com.amazonaws.services.comprehend.model.DetectDominantLanguageResult;
import com.amazonaws.services.comprehend.model.DetectKeyPhrasesRequest;
import com.amazonaws.services.comprehend.model.DetectKeyPhrasesResult;

import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import DavidApp.DavidAppServer.filters.SimpleFilter;



@EnableZuulProxy
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
//		String text = "It is raining today in Seattle";
//
//        // Create credentials using a provider chain. For more information, see
//        // https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html
//        AWSCredentialsProvider awsCreds = DefaultAWSCredentialsProviderChain.getInstance();
// 
//        AmazonComprehend comprehendClient =
//            AmazonComprehendClientBuilder.standard()
//                                         .withCredentials(awsCreds)
//                                         .withRegion("us-east-1")
//                                         .build();
//                                         
//        // Call detectKeyPhrases API
//        System.out.println("Calling DetectKeyPhrases");
//        DetectKeyPhrasesRequest detectKeyPhrasesRequest = new DetectKeyPhrasesRequest().withText(text)
//                                                                                       .withLanguageCode("en");
//        DetectKeyPhrasesResult detectKeyPhrasesResult = comprehendClient.detectKeyPhrases(detectKeyPhrasesRequest);
//        detectKeyPhrasesResult.getKeyPhrases().forEach(System.out::println);
//        System.out.println("End of DetectKeyPhrases\n");
		System.out.println("test");
		SpringApplication.run(App.class, args);
	}
	
  @Bean
  public SimpleFilter simpleFilter() {
    return new SimpleFilter();
  }
	
	
//	@Component
//	class CompCommandLineRunner implements CommandLineRunner{
//		 @Override
//		    public void run(String... strings)throws Exception{
//			 	String text = "It is raining today in Seattle";
//
//		        // Create credentials using a provider chain. For more information, see
//		        // https://docs.aws.amazon.com/sdk-for-java/v1/developer-guide/credentials.html
//		        AWSCredentialsProvider awsCreds = DefaultAWSCredentialsProviderChain.getInstance();
//
//		        AmazonComprehend comprehendClient =
//		            AmazonComprehendClientBuilder.standard()
//		                                         .withCredentials(awsCreds)
//		                                         .withRegion("us-east-1")
//		                                         .build();
//
//		        // Call detectKeyPhrases API
//		        System.out.println("Calling DetectKeyPhrases");
//		        DetectKeyPhrasesRequest detectKeyPhrasesRequest = new DetectKeyPhrasesRequest().withText(text)
//		                                                                                       .withLanguageCode("en");
//		        DetectKeyPhrasesResult detectKeyPhrasesResult = comprehendClient.detectKeyPhrases(detectKeyPhrasesRequest);
//		        detectKeyPhrasesResult.getKeyPhrases().forEach(System.out::println);
//		        System.out.println("End of DetectKeyPhrases\n");
//
//		    }
//	}
	
	
//	@Component
//	class HotelCommandLineRunner implements CommandLineRunner{
//
//	    private final HotelRepository repository;
//
//	    public HotelCommandLineRunner(HotelRepository repository){
//	        this.repository = repository;
//	    }
//
//	    @Override
//	    public void run(String... strings)throws Exception{
//	    	
//	    	System.out.println("test");
//	    	System.out.println("test");
//
//	        Stream.of("Conrad","Hilton","Shilla","Hayatt","Westin","Sangrila").forEach(name-> repository.save(new Hotel(name)));
//
//	        repository.findAll().forEach(System.out::println);
//	    }
//	}
	
	
//	@Component
//	class TextCommandLineRunner implements CommandLineRunner{
//
//	    private final TextRepository repository;
//
//	    public TextCommandLineRunner(TextRepository repository){
//	        this.repository = repository;
//	    }
//
//	    @Override
//	    public void run(String... strings)throws Exception{
//
//	        Stream.of("Text1","Text2","Text3","Text4","Text5","Text6").forEach(text-> repository.save(new Text(text)));
//
//	        repository.findAll().forEach(System.out::println);
//	    }
//	}
	
	
}

