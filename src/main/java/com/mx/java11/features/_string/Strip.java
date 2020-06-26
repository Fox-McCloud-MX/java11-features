package com.mx.java11.features._string;

/*
But we already have trim(). Then what’s the need of strip()?
strip() is “Unicode-aware” evolution of trim().

When trim() was introduced, Unicode wasn’t evolved. Now,
the new strip() removes all kinds of whitespaces leading
and trailing(check the method Character.isWhitespace(c)
to know if a unicode is whitespace or not)
*/
public class Strip {
    public static void main(String[] args) {
        String strip = "  strip  ";
        String stripLeading = "  stripLeading  ";
        String stripTrailing = "  stripTrailing  ";

        //String.strip() -> Removes the white space from both, beginning and the end of string.
        System.out.println(strip.strip()); //strip

        System.out.println(stripLeading.stripLeading()); //stripLeading__

        System.out.println(stripTrailing.stripTrailing()); //__stripTrailing
    }
}
