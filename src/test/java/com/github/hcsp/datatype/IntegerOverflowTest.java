package com.github.hcsp.datatype;

import static org.hamcrest.Matchers.containsString;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.junit.jupiter.api.Test;

public class IntegerOverflowTest {
    @Test
    @CaptureSystemOutput
    public void printNumbersCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(containsString("i=1000000000"));
        capture.expect(containsString("i=2000000000"));
        capture.expect(containsString("i=3000000000"));
        IntegerOverflow.main(null);
    }
}
