package ca.adrian;

public class VideoProcessor {
    private IVideoEncoder encoder;
    private IVideoDatabase database;
    private IEmailService notificationService;

    public VideoProcessor(
            IVideoEncoder encoder,
            IVideoDatabase database,
            IEmailService emailService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = emailService;
    }

        public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.sendEmail(video.getUser());
    }
}

