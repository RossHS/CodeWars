package exercises.codewars.kyu6;

/**
 * You have to extract a portion of the file name as follows:
 * <p>
 * Assume it will start with date represented as long number
 * Followed by an underscore
 * Youll have then a filename with an extension
 * it will always have an extra extension at the end
 * Inputs:
 * 1231231223123131_FILE_NAME.EXTENSION.OTHEREXTENSION
 * <p>
 * 1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34
 * <p>
 * 1231231223123131_myFile.tar.gz2
 * Outputs
 * FILE_NAME.EXTENSION
 * <p>
 * This_is_an_otherExample.mpg
 * <p>
 * myFile.tar
 * The recommend way to solve it is using RegEx and specifically groups.
 *
 * @author Ross Khapilov
 * @version 1.0 13.10.2018
 */
public class FileNameExtractor {
    public static String extractFileName(String dirtyFileName) {
        return dirtyFileName.replaceAll(".*?_(.*)\\..*", "$1");
    }
}
