
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author martin
 */
@Controller
public class IndexController {
    
    @RequestMapping("/hello")
    public ResponseEntity<String> handleIndexGet() {
        return ResponseEntity.ok("I'm running on!");
    }
}
