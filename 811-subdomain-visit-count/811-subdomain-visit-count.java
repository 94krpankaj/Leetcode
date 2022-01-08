class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> countMap = new HashMap<String, Integer>();
        List<String> finalList = new ArrayList<String>();
        for(int i = 0; i<cpdomains.length; i++) {
            String item = cpdomains[i];
            int count = Integer.parseInt(item.split(" ")[0]);
            String domain = item.split(" ")[1];
            String[] subdomains = domain.split("\\.");
            StringBuilder domainString = new StringBuilder();
            System.out.print(domain+" "+ subdomains.length);
            for(int j = subdomains.length-1; j>=0; j--) {
                 System.out.print(subdomains[j]+" ");
                 domainString.insert(0,subdomains[j]);
                 
                if(countMap.containsKey(domainString.toString())){
                    countMap.put(domainString.toString(), countMap.get(domainString.toString())+ count);
                } else {
                    countMap.put(domainString.toString(), count);
                }
                if( j !=0){
                      domainString.insert(0,".");
                  }
            }
        }
        
        for(Map.Entry<String, Integer> entry: countMap.entrySet()){
            StringBuilder finalString = new StringBuilder();
            finalString.append(entry.getValue());
            finalString.append(" ");
            finalString.append(entry.getKey());
            finalList.add(finalString.toString());
        }
        
        
    return finalList;
        
    }
}