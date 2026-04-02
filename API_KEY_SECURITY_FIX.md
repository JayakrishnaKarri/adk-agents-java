# API Key Security Issue - URGENT

## Problem
Your Google API key `AIzaSyAYBrInsxsTMKrZTv8y2Heain3-7hh3Rzc` has been reported as leaked and is now blocked by Google.

## Immediate Actions Required

### 1. Get a New Google API Key
1. Go to [Google AI Studio](https://aistudio.google.com/app/apikey)
2. Sign in with your Google account
3. Click "Create API Key"
4. Copy the new API key

### 2. Update Your .env File
Replace the current key in `.env` with your new key:
```bash
export GOOGLE_API_KEY="your_new_api_key_here"
```

### 3. Secure Your API Key
- **Never commit API keys to version control**
- Add `.env` to your `.gitignore` file
- Use environment variables in production
- Restrict API key usage in Google Cloud Console

### 4. Test Your Weather Assistant
After updating the API key:
```bash
# Load the new environment variables
source .env

# Run the weather assistant
mvn compile exec:java -Dexec.mainClass="com.jk.agent.WeatherAssistantLive"
```

## Weather Assistant Setup (After API Key Fix)

### For Real-Time Weather Data:
1. **Get OpenWeatherMap API Key** (separate from Google):
   - Visit: https://openweathermap.org/api
   - Sign up for free account
   - Get API key (1000 calls/day free)

2. **Add to .env file**:
   ```bash
   export GOOGLE_API_KEY="your_new_google_api_key"
   export OPENWEATHER_API_KEY="your_openweather_api_key"
   ```

3. **Run Weather Assistant**:
   ```bash
   source .env
   mvn compile exec:java -Dexec.mainClass="com.jk.agent.WeatherAssistantLive"
   ```

## Security Best Practices
- Use `.gitignore` to exclude `.env` files
- Rotate API keys regularly
- Monitor API key usage
- Set up API key restrictions in Google Cloud Console
- Use different keys for development and production

## Next Steps
1. Get new Google API key immediately
2. Update `.env` file
3. Test basic agent functionality
4. Then proceed with weather API integration