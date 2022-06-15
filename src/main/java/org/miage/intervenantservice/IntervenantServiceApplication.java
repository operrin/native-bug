package org.miage.intervenantservice;

import java.net.URI;
import java.time.Instant;
import java.time.ZonedDateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.NativeHint;
import org.springframework.nativex.hint.TypeHint;
import io.r2dbc.postgresql.PostgresqlConnectionFactoryProvider;

@SpringBootApplication
@NativeHint(trigger = PostgresqlConnectionFactoryProvider.class, types = {
                @TypeHint(types = { Instant[].class, ZonedDateTime[].class, URI[].class }, access = {}),
})
public class IntervenantServiceApplication {

        public static void main(String[] args) {
                SpringApplication.run(IntervenantServiceApplication.class, args);
        }

}
