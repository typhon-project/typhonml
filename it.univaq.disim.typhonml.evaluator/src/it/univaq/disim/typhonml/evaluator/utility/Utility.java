package it.univaq.disim.typhonml.evaluator.utility;

import java.io.File;
import java.util.List;

public class Utility {
	
	public static void search(final String pattern, final File folder, List<File> result) {
        for (final File f : folder.listFiles()) {

            if (f.isDirectory()) {
                search(pattern, f, result);
            }

            if (f.isFile()) {
                if (f.getName().matches(pattern)) {
                    result.add(f);
                }
            }

        }
    }

}
