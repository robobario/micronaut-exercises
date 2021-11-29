package task;

import io.micronaut.http.annotation.*;

@Controller("/post")
public class Task {

    @Post
    public String index(@Body String price) {
        return "How do I wrap " + price + " in JSON?";
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