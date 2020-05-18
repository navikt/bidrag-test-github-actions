package no.nav.bidrag.bidrag.test.gh.actions;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BidragTestGhActionsApplicationTests {

  @Test
  void contextLoads() {
  }

  @Test
  @SuppressWarnings("ConstantConditions")
  @DisplayName("skal feile for å teste bygg som mangler at alle tester kjører uten feil")
  void skalFeile() {
    assertThat(true).isFalse();
  }}
