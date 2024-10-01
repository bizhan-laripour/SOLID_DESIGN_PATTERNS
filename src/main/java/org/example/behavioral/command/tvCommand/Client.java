package org.example.behavioral.command.tvCommand;

public class Client {

    public static void main(String[] args) {
        System.out.println("start of command pattern ....");
        Tv tv = new LgTelevision();

        // commands
        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);
        Command channelUpCommand = new ChannelUpCommand(tv);
        Command channelDownCommand = new ChannelDownCommand(tv);
        Command volumeUpCommand = new VolumeUpCommand(tv);
        Command volumeDownCommand = new VolumeDownCommand(tv);

        // execute
        turnOnCommand.execute();
        channelUpCommand.execute();
        channelUpCommand.execute();
        volumeUpCommand.execute();
        volumeUpCommand.execute();
        volumeUpCommand.execute();
        turnOffCommand.execute();
        System.out.println(tv.getChannel());
        System.out.println(tv.getVolume());


    }
}
