package task;

import io.micronaut.http.annotation.*;

@Controller("/post")
public class Task {

    @Post
    public String index(@Body String body) {
        return "How do I get price from " + body;
    }

    public static class PricedThing {

        private Double price;

        public Double getPrice() {
            return price;
        }

        public void setPrice(Double price) {
            this.price = price;
        }
    }

}