package com.eduard.patterns.builder;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class Response {
    boolean enabled;
    int requiredApprovals;
    String branch;

    public static ResponseBuilderPatternBuilder builder() {
        return new ResponseBuilderPatternBuilder();
    }

    public static class ResponseBuilderPatternBuilder {
        private boolean enabled;
        private int requiredApprovals;
        private String branch;

        ResponseBuilderPatternBuilder() {
        }

        public ResponseBuilderPatternBuilder enabled(boolean enabled) {
            this.enabled =enabled;
            return this;
        }

        public ResponseBuilderPatternBuilder requiredApprovals(int requiredApprovals) {
            this.requiredApprovals = requiredApprovals;
            return this;
        }

        public ResponseBuilderPatternBuilder branch(String branch) {
            this.branch =branch;
            return this;
        }

        public Response build() {
            return new Response(enabled, requiredApprovals, branch);
        }



    }

}
