import argparse
import pafy
from googleapiclient.discovery import build
from googleapiclient.errors import HttpError

DEVELOPER_KEY = 'DEVELOPER KEY'
YOUTUBE_API_SERVICE_NAME = 'youtube'
YOUTUBE_API_VERSION = 'v3'

def pafy_video(video_id):
    url = 'https://www.youtube.com/watch?v={0}'.format(video_id)
    vid = pafy.new(url)

def pafy_playlist(playlist_id):
    url = "https://www.youtube.com/playlist?list={0}".format(playlist_id)
    playlist = pafy.get_playlist(url)


def youtube_search(options):
  youtube = build(YOUTUBE_API_SERVICE_NAME, YOUTUBE_API_VERSION, developerKey=DEVELOPER_KEY)

  search_response = youtube.search().list(
    q='Hello world',
    part='id,snippet',
    maxResults=options.max_results
  ).execute()

  videos = []
  playlists = []
  channels = []
  for search_result in search_response.get('items', []):
    if search_result['id']['kind'] == 'youtube#video':
      videos.append('%s' % (search_result['id']['videoId']))
    elif search_result['id']['kind'] == 'youtube#channel':
      channels.append('%s' % (search_result['id']['channelId']))
    elif search_result['id']['kind'] == 'youtube#playlist':
      playlists.append('%s' % (search_result['id']['playlistId']))


  if videos:
    print('Videos:{0}'.format(videos))
    pafy_video(videos[0])
  elif playlists:
    print('Playlists:{0}'.format(playlists))
    pafy_video(playlists[0])

  #https://www.youtube.com/watch?v=rOU4YiuaxAM
  #url = 'https://www.youtube.com/watch?v={0}'.format(videos[0])
  #print(url)

if __name__ == '__main__':
  parser = argparse.ArgumentParser()
  parser.add_argument('--q', help='Search term', default='Google')
  parser.add_argument('--max-results', help='Max results', default=3)
  args = parser.parse_args()
  youtube_search(args)