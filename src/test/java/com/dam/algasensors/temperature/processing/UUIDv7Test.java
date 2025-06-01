package com.dam.algasensors.temperature.processing;

import com.dam.algasensors.temperature.processing.common.IdGenerator;
import com.dam.algasensors.temperature.processing.common.UUIDv7Utils;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

@DisplayName("UUIDv7 Test")
class UUIDv7Test {

    @Test
    @DisplayName("Should Extract OffsetDateTime From UUIDv7")
    void shouldGenerateUUIDv7() {
        UUID uuid = IdGenerator.generateTimeBasedUUID();

        OffsetDateTime uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime currentDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertThat(uuidDateTime).isEqualTo(currentDateTime);
    }

}