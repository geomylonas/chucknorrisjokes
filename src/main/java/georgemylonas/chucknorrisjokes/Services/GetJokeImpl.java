package georgemylonas.chucknorrisjokes.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetJokeImpl implements GetJoke{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public GetJokeImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String recievejoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
