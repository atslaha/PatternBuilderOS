package il.co.patternBuilderOS;

public class PatternBuilderOS {
    private final String osName;
    private final String osVersion;

    public PatternBuilderOS(final String osName, final String osVersion){
        this.osName = osName;
        this.osVersion = osVersion;
    }

    public String getOsName(){
        return this.osName;
    }

    public String getOsVersion(){
        return this.osVersion;
    }


    public static class Builder {

        private String osName;
        private String osVersion;

        public Builder (){}

        public Builder(final String osName, final String osVersion){
            this.osName = osName;
            this.osVersion = osVersion;
        }

        public Builder setOsName(final String osName){
            this.osName = osName;
            return this;
        }

        public Builder setOsVersion(final String osVersion){
            this.osVersion = osVersion;
            return this;
        }

        public PatternBuilderOS build(){
            return new PatternBuilderOS(osName, osVersion);
        }
    }
}
