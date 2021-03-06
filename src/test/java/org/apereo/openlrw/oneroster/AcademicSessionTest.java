package org.apereo.openlrw.oneroster;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apereo.model.oneroster.AcademicSession;
import org.apereo.model.oneroster.AcademicSessionType;
import org.apereo.model.oneroster.Status;
import org.junit.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Map;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

/**
 * @author stalele
 *
 */
public class AcademicSessionTest {
  @Test
  public void whenMinimallyPopulatedAllGood() throws JsonProcessingException {
    Map<String, String> testMetadata = java.util.Collections.singletonMap("meta", "data");
    
    AcademicSession academicSession
      = new AcademicSession.Builder()
        .withSourcedId("acad-sid")
        .withMetadata(testMetadata)
        .withTitle("2017")
        .withAcademicSessionType(AcademicSessionType.term)
        .withStatus(Status.active)
        .withDateLastModified(Instant.now())
        .withStartDate(LocalDate.of(2017, 8, 21))
        .withEndDate(LocalDate.of(2018, 6, 2))
        .build();

    
    ObjectMapper mapper = new ObjectMapper();
    String result = mapper.writeValueAsString(academicSession);
    System.out.println(result);
    assertThat(result, containsString("term"));
    assertThat(result, containsString("acad-sid"));
    assertThat(result, containsString("meta"));
    assertThat(result, containsString("data"));
  }

}
