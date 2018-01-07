package georgemylonas.chucknorrisjokes.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetJokeImpl implements GetJoke{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public GetJokeImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }


    @Override
    public String recievejoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
