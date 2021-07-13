package org.sanmibuh.kata.karatechop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class KarateChopTest {

  private static Stream<Arguments> chopSource() {
    return Stream.of(
        Arguments.of(-1, 3, new int[]{}),
        Arguments.of(-1, 3, new int[]{1}),
        Arguments.of(0, 1, new int[]{1}),

        Arguments.of(0, 1, new int[]{1, 3, 5}),
        Arguments.of(1, 3, new int[]{1, 3, 5}),
        Arguments.of(2, 5, new int[]{1, 3, 5}),
        Arguments.of(-1, 0, new int[]{1, 3, 5}),
        Arguments.of(-1, 2, new int[]{1, 3, 5}),
        Arguments.of(-1, 4, new int[]{1, 3, 5}),
        Arguments.of(-1, 6, new int[]{1, 3, 5}),

        Arguments.of(0, 1, new int[]{1, 3, 5, 7}),
        Arguments.of(1, 3, new int[]{1, 3, 5, 7}),
        Arguments.of(2, 5, new int[]{1, 3, 5, 7}),
        Arguments.of(3, 7, new int[]{1, 3, 5, 7}),
        Arguments.of(-1, 0, new int[]{1, 3, 5, 7}),
        Arguments.of(-1, 2, new int[]{1, 3, 5, 7}),
        Arguments.of(-1, 4, new int[]{1, 3, 5, 7}),
        Arguments.of(-1, 6, new int[]{1, 3, 5, 7}),
        Arguments.of(-1, 8, new int[]{1, 3, 5, 7})
    );
  }

  @Disabled
  @ParameterizedTest
  @MethodSource("chopSource")
  void chop(final int expected, final int target, final int[] data) {
    final var result = KarateChop.chop(target, data);

    assertEquals(expected, result);
  }
}