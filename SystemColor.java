/**
 * * **************************************************************************************
 * Copyright MikeTheDev (c) 2015.  All Rights Reserved.
 * Any code contained within SystemColor (this document), and any associated APIs with similar branding
 * are the sole property of Michael Petramalo.  Distribution, reproduction, taking sections, or
 * claiming any contents as your own will break the terms of the license, and void any
 * agreements with the third-party, you.
 * Thanks.
 * Created on 8/4/2015 at 6:33 PM.
 * ******************************************************************************************
 */
public enum SystemColor {

    RESET{
        public String toString(){
            return "\u001B[0m";
        }
    },
    BLACK{
        public String toString(){
            return "\u001B[30m";
        }
    },
    GRAY{
        public String toString(){
            return "\u001B[30m\u001B[1m";
        }
    },
    MAROON{
        public String toString(){
            return "\u001B[31m";
        }
    },
    RED{
        public String toString(){
            return "\u001B[31m\u001B[1m";
        }
    },
    GREEN{
        public String toString(){
            return "\u001B[32m";
        }
    },
    LIME{
        public String toString(){
            return "\u001B[32m\u001B[1m";
        }
    },
    GOLD{
        public String toString(){
            return "\u001B[33m";
        }
    },
    YELLOW{
        public String toString(){
            return "\u001B[33m\u001B[1m";
        }
    },
    BLUE{
        public String toString(){
            return "\u001B[34m";
        }
    },
    ROYAL{
        public String toString(){
            return "\u001B[34m\u001B[1m";
        }
    },
    PURPLE{
        public String toString(){
            return "\u001B[35m";
        }
    },
    MAGENTA{
        public String toString(){
            return "\u001B[35m\u001B[1m";
        }
    },
    CYAN{
        public String toString(){
            return "\u001B[36m";
        }
    },
    AQUAMARINE{
        public String toString(){
            return "\u001B[36m\u001B[1m";
        }
    },
    SILVER{
        public String toString(){
            return "\u001B[37m";
        }
    },
    WHITE{
        public String toString(){
            return "\u001B[37m\u001B[1m";
        }
    }
}
