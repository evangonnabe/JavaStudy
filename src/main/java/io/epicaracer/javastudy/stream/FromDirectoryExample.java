package io.epicaracer.javastudy.stream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromDirectoryExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/epicaracer/git/javastudy/src/main/java/io/epicaracer/javastudy");
		Stream<Path> stream = Files.list(path);
		stream.forEach(p -> System.out.println(p.getFileName())); // sub directory or filename
	}
}
