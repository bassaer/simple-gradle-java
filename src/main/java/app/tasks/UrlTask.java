package app.tasks;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.stream.Stream;

public class UrlTask implements Task {

    @Override
    public void run() {
        Stream.of(
            "https://example.com",
            "foo",
            "://a",
            "http://example.com/hoge/piyo.png"
        )
            .map(input -> {
                try {
                    return new URI(input);
                } catch (URISyntaxException e) {
                    System.err.println(e.getLocalizedMessage());
                }
                return null;
            })
            .filter(Objects::nonNull)
            .forEach(uri -> System.out.printf("host: %s, path: %s\n", uri.getRawAuthority(), uri.getPath()));
    }
}
